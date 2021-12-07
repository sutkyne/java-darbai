import java.util.ArrayList;

public class MessagingService {
	private ArrayList<Message> messList;
public MessagingService() {
	messList= new ArrayList<>();
}
public void add(Message message) {
	if(message.getContent().length()<=280)
	messList.add(message);
}
public ArrayList<Message> getMessages(){
	return messList;
}
}
