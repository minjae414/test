/*
 * ���� Chatting Ŭ������ ������ ������ �߻��մϴ�.
 * ������ �����Դϱ�?
 */

package com.exer06;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "�ȳ��ϼ���.";
					//String message = "[" + nickName + "] " + inputData;
					//sendMessage(message);
				}
			}
		};
		chat.start();
	}
	class Chat{
		void start() {}
		void sendMessage(String message) {}
	}
}
