import java.util.ArrayList;

import javax.swing.JOptionPane;

import by.zti.SerializationManager;


public class Main {
	private static ArrayList<Profile> profiles = new ArrayList<Profile>();
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		profiles = (ArrayList<Profile>) SerializationManager.deSerializeData("profiles", "ser", "");//десереал≥зуЇ дан≥
		System.out.println(profiles.size());
		Profile profile = new Profile();
		profile.setName(JOptionPane.showInputDialog(null, "¬вед≥ть в≥ше ≥м€"));
		profile.setSurname(JOptionPane.showInputDialog(null, "¬вед≥ть веше пр≥звище"));
		profiles.add(profile);
		for (Profile p : profiles) {
			System.out.println(p.getName()+" "+p.getSurname());
		}
		System.out.println(profiles.size());
		SerializationManager.serializeData(profiles, "profiles", "ser", "");//серел≥азуЇ дан≥ б по сут≥ пише на диск дан≥ з пам€т≥ з можлив≥стю подальшого вит€гуванн€ њх
	}


	
	
}
