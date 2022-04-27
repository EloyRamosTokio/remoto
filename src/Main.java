
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OpositorController opoController = new OpositorController();
		
		for (int i = 0; i<opoController.todosOpositores().size();i++) {
			System.out.println(opoController.todosOpositores().get(i).toString());
		}
		//Crear un metodo que sea solo el nombre y el dni. select nombre dni from opositor.
		for (int i = 0; i<opoController.todosOpositores().size();i++) {
			System.out.println(opoController.dniNombreOpositores().get(i).toString2());
		}
	}
	
}
