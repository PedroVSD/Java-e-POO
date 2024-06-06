package jogoP1;

public enum Estado {
	ATIVO(), PAUSADO(), GAMEOVER();
	
	private int item;
	
	public void setItem(int item) {
		this.item = item;
	}
	
	public int getItem() {
		return item;
	}
}
