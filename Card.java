
public class Card implements Comparable<Card> {
	public static enum Suit {CLUB, DIA, HEART, SPADE, JOKER};
	private static final String[] toStr = {"�N���u", "�_�C��", "�n�[�g", "�X�y�[�h", "�W���[�J�["};
	private Suit suit;	// �X�[�g
	private int num;	// �g�����v�̐���
	private String str;	// �Ή����镶����
}
	public Card(Suit suit, int num){
		this.suit = suit;
		this.num = num;
		this.str = toStr[suit.ordinal()];
		if(suit != Suit.JOKER){
			this.str += "��" + num;
			}
		}

	@Override
	public int compareTo(Card o) {
		int slf = this.suit.ordinal();
		int obj = o.suit.ordinal(); //�X�[�g�������Ȃ琔��������
		return slf == obj ? this.num - o.num : slf - obj;
		}
	@Override
	public String toString(){
		return str;
		}

	public Suit getSuit(){
		return suit;
		}
	public int getNum(){ return num;	}}