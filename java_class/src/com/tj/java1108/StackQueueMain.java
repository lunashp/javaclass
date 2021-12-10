package com.tj.java1108;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueueMain {

	public static void main(String[] args) {
		//문자열 저장하는 Stack 생성
		Stack <String> stack = new Stack<>();
		//데이터 추가 
		stack.push("귤");
		stack.push("포도");
		stack.push("키위");
		stack.push("석류");
		
		//데이터를 삭제하면서 꺼내기
		//더이상 데이터가 없는데 pop을 하면 underflow 에러 
		String name = stack.pop();
		System.out.println(name);
		
		//일반 큐는 ArrayList를 만들고 remove(0)을 하면 됩니다. 
		//우선순위 큐는 데이터를 크기 순서대로 꺼내주는 큐 입니다. 
		//순서대로 저장되는 것이 아닙니다. 
		PriorityQueue <String> queue = 
				new PriorityQueue<>();
		queue.offer("KOREA");
		queue.offer("ENGLAND");
		queue.offer("NEWZEALAND");
		queue.offer("INDONESIA");
		queue.offer("TAIWAN");
		
		//우선순위가 가장 낮은 ENGLAND를 꺼내 옵니다(삭제하면서 리턴)
		System.out.println(queue.poll());

		}

	}


