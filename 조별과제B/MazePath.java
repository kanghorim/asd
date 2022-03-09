package week_10;
import java.util.*;
import java.util.Stack;
public class MazePath {
	private int[][] maze = {{ 1, 1, 1, 1, 1, 1, 1, 1, 1 },
							{ 1, 0, 1, 1, 1, 1, 1, 1, 1 }, 
							{ 1, 0, 1, 1, 1, 1, 1, 1, 1 },
							{ 1, 0, 1, 1, 1, 1, 1, 1, 1 },
							{ 1, 0, 0, 1, 1, 1, 1, 1, 1 },
							{ 1, 1, 0, 0, 1, 0, 0, 0, 1 },
							{ 1, 1, 1, 0, 1, 0, 1, 0, 1 },
							{ 1, 1, 0, 0, 0, 0, 1, 0, 0 },
							{ 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

	private int[][] move = { { -1, 0 }, { 0, 1 },
							{ 1, 0 }, { 0, -1 } }; // 북동남서
	//
	private int m = maze.length - 2; // 세로
	private int n = maze[0].length - 1; // 가로

	public MazePath() {

		int mark[][] = new int[maze.length][maze[0].length];
		Stack st = new Stack(); // 이 스텍이 경로를 이동했다는 흔적을 남기는것
		Stack st1 = new Stack(); //  올바른 이후 경로 = 올바른 경로 삽입할 스택
		st.push(new Mazecell(1, 1, 1)); // 초기출발위치 및 방향 설정
		while (st.isEmpty() != true) { // 스텍이안에 값이 트루가 아닐떄

			Mazecell mc = (Mazecell) st.pop(); // 지나온 경로를 pop함
			while (mc.dir <= 3) { // 내가 처음에 지나간 방향을 제외한 나머지 방향을 탐색한다 총 3번 
				int nextI = mc.i + move[mc.dir][0]; // 다음 시도할 헹(i)를 설정
				// i값이 처음에 1
				int nextJ = mc.j + move[mc.dir][1]; // 다음 시도할 열(j)를 설정
				// j값도 처음에 1 이유는 처음 시작 장소가 1,1임 
				if (nextI == m && nextJ == n) { // 미로 경로 발견
					System.out.println("The path is as follows");
					st.push(new Mazecell(mc.i, mc.j, mc.dir)); // 마지막 경로 지정
					st.push(new Mazecell(nextI, nextJ, 0)); // 마지막 지점 지정
					while (st.isEmpty() != true) {
						st1.push((Mazecell) st.pop());
						// 39줄이 st스텍의 (2,1)값이팝되고  st1값으로 저장이됨
						// mc =(Mazecell)st.pop(); // 올바른 경로 출력
						// maze[mc.i][mc.j] = 9;
						// System.out.println(mc);

					}
					while (st1.isEmpty() != true) {
						mc = (Mazecell) st1.pop();
						System.out.println(mc);
						maze[mc.i][mc.j] = 2;

					}
					displayMaze(); // 경로 확인 완료 후 출력
					return;

				}

				// 이동가능 & 시도해보지 않은 위치 -> 중간에 재탐색 하는 코드 
				if (maze[nextI][nextJ] == 0 && mark[nextI][nextJ] == 0) {

					mark[nextI][nextJ] = 1;
					st.push(new Mazecell(mc.i, mc.j, mc.dir)); // 지나온 경로를 스택에
																// push

					mc.i = nextI;
					mc.j = nextJ;
					mc.dir = 0;

				} else {

					mc.dir++;
				}

			}

		}

		System.out.println("There is no path");

	}

	public void displayMaze() {

		String[] str = { "□", "■", "☞" };
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(str[(maze[i][j])]);

			}
			System.out.println("");

		}

	}

	public static void main(String args[]) {

		new MazePath();

	}

}
