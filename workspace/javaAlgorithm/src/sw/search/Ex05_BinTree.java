package sw.search;

import java.util.Comparator;
import java.util.Scanner;

import sw.search.BinTreeTester.Data;
import sw.search.BinTreeTester.Menu;

class BinTreeTester {
	
	public class Ex05_BinTree<K, V> {	// 하나도 모르겠음 복습 요망
		
		
		static class Node<K, V>{
			private K key;
			private V data;
			private Node<K, V> left;
			private Node<K, V> right;
			
			public Node(K key, V data, Node<K, V> left, Node<K, V> right) {
				this.key = key;
				this.data = data;
				this.left = left;
				this.right = right;
			}
			
			public K getKey() {
				return key;
			}

			public V getData() {
				return data;
			}

			void print() {
				System.out.println(data);
			}
			
		}
		
		private Node<K, V> root;
		private Comparator<? super K> comparator = null;
		
		public Ex05_BinTree() {
			root = null;
		}
		
		public Ex05_BinTree(Comparator<? super K> c) {
			this();
			comparator = c;
		}
		
		// 값 비교하기 : Comparable의 compareTo() 와 Comparator의 compare()이 있다
		private int comp(K key1, K key2) {
			return (comparator == null)? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1, key2);
		}
		
		// 키로 검색
		public V search(K key) {
			Node<K, V> p = root;
			
			while(true) {
				if(p==null) return null;
				int cond = comp(key, p.getKey());
				if(cond==0) return p.getData();
				else if(cond<0) p = p.left;
				else if(cond>0) p = p.right;
			}
		}
		
		private void addNode(Node<K, V> node, K key, V data) {
			int cond = comp(key, node.getKey());
			if(cond==0) return;
			else if(cond<0) {
				if(node.left==null)
					node.left = new Node<K, V>(key, data, null, null);
				else
					addNode(node.left, key, data);
			}else {
				if(node.right==null)
					node.right = new Node<K, V>(key, data, null, null);
				else
					addNode(node.right, key, data);
			}
		}
		
		public void add(K key, V data) {
			if(root==null)
				root = new Node<K, V>(key, data, null, null);
			else
				addNode(root, key, data);
		}
		
		public boolean remove(K key) {
			Node<K, V> p = root;
			Node<K, V> parent = null;
			boolean isLeftChild = true;
			
			while(true) {
				if(p==null) return false;
				int cond = comp(key, p.getKey());
				if(cond==0)
					break;
				else {
					parent = p;
					if(cond<0) {
						isLeftChild = true;
						p = p.left;
					}else {
						isLeftChild = false;
						p = p.right;
					}
				}
			}
			
			if(p.left==null) {
				if(p==root)
					root = p.right;
				else if(isLeftChild)
					parent.left = p.right;
				else
					parent.right = p.right;
			}else if(p.right==null) {
				if(p==root)
					root = p.left;
				else if(isLeftChild)
					parent.left = p.left;
				else
					parent.right = p.left;
			}else {
				parent = p;
				Node<K, V> left = p.left;
				isLeftChild = true;
				while(left.right!=null) {
					parent = left;
					left = left.right;
					isLeftChild = false;
				}
				p.key = left.key;
				p.data = left.data;
				if(isLeftChild)
					parent.left = left.left;
				else
					parent.right = left.left;
			}
			return true;
		}
		
		private void printSubTree(Node node){
			if(node!=null) {
				printSubTree(node.left);
				System.out.println(node.key + " " + node.data);
				printSubTree(node.right);
			}
		}
		
		public void print() {
			printSubTree(root);
		}

	}
    
}





