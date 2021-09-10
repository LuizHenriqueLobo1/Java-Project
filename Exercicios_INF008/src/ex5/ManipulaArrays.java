package ex5;

public class ManipulaArrays {

	String[] array = new String[5];
	
	public void empilha(String str) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == null) {
				this.array[i] = str;
				break;
			}
		}
		printa();
	}
	
	public void desempilha() {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				count++;
			}
		}
		this.array[count-1] = null;
		printa();
	}
	
	private void printa() {
		for(int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				System.out.println(array[i]);
			}
		}
	}
	
}
