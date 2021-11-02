package main;

import java.util.Random;

public class PerfectMatrix {

	private int[][] matrix;
	private Random random;
	private int[] widthIndex;
	private int[] heightIndex;
	
	public PerfectMatrix() {
		this.matrix = new int[3][3];
		this.random = new Random();
		this.widthIndex = new int[3];
		this.heightIndex = new int[3];
	}
	
	public void makeMatrix() {
		this.initializeMatrix();
		this.fillThreeMatrixIndexs();
	}
	
	public void printMatrix() {
		System.out.println("-----");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----");
	}
	
	public boolean makePlay(int heightIndex, int widthIndex, int value) {
		boolean validMove = false;
		if(heightIndex > 2 || widthIndex > 2) {
			validMove = false;
		} else if(this.matrix[heightIndex][widthIndex] == 0) {
			this.matrix[heightIndex][widthIndex] = value;
			validMove = true;
		}
		return validMove;
	}
	
	private void initializeMatrix() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				this.matrix[i][j] = 0;
			}
		}
	}
	
	private void fillThreeMatrixIndexs() {
		this.setIndexs();
		for(int i = 0; i < 3; i++) {
			this.matrix[this.widthIndex[i]][this.heightIndex[i]] = this.random.nextInt(10 - 1) + 1;
		}
	}
	
	private void setIndexs() {
		this.widthIndex  = this.generateDistinctNumbers();
		this.heightIndex = this.generateDistinctNumbers();
	}
	
	private int[] generateDistinctNumbers () {
		int[] array = {-1, -1, -1};
		for(int i = 0; i < array.length; i++) {
			boolean equalNumber = false;
			int number = -1;
			while(!equalNumber) {
				number = this.random.nextInt(3);
				equalNumber = checkNumbers(number, array);
			}
			array[i] = number;
		}
		return array;
	}
	
	private boolean checkNumbers(int number, int array[]) {
		boolean check = true;
		for(int i = 0; i < array.length; i++) {
			if(number == array[i])
				check = false;
		}
		return check;
	}
	
}
