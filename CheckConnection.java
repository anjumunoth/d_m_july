package package1;
import com.mongodb.MongoClient; 
import com.mongodb.DB; 
import com.mongodb.DBCollection; 
public class CheckConnection {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) { 
		MongoClient mongoClient = new MongoClient("localhost", 27017); 
		DB db = mongoClient.getDB("mybookdb"); 
		DBCollection items = db.getCollection("bookCol");
		System.out.println("Connection established successfully");
	}
}
