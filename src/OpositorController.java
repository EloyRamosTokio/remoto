import java.util.ArrayList;

public class OpositorController {
	private BDController controladorBD;

	public OpositorController() {
		super();
		this.controladorBD = new BDController();
		
	}

	public BDController getControladorBD() {
		return controladorBD;
	}

	public void setControladorBD(BDController controladorBD) {
		this.controladorBD = controladorBD;
	}

	@Override
	public String toString() {
		return "OpositorController [controladorBD=" + controladorBD + "]";
	}
	public ArrayList<Opositor> todosOpositores(){
		ArrayList<Opositor> opositores = new ArrayList<Opositor>();
		opositores = controladorBD.todosOpositores();
		return opositores;
	}
	public ArrayList<Opositor> dniNombreOpositores(){
		ArrayList<Opositor> opositores = new ArrayList<Opositor>();
		opositores = controladorBD.dniNombreOpositores();
		return opositores;
	}
	
}
