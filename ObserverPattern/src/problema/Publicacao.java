package problema;

public class Publicacao extends Subject{
	
	private String NewPubli;
	
	public void setNewPubli(String NewPubli) {
		this.NewPubli = NewPubli;
	}
	public String getNewPubli() {
		return NewPubli;
	}
	public Publicacao(Usuario dono) {
		this.followCont(dono);
	}
	public void receberLike(Usuario usuario) {
		this.notifyAllMethod(usuario.getNome() + " acabou de curtir a publicação: " + this.getNewPubli());
	}
}
