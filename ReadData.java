package package1;
import com.mongodb.MongoClient; 
import com.mongodb.DB; 
import com.mongodb.DBCollection; 
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import com.mongodb.MongoException;
public class ReadData {

	public static void main(String[] args) {
		
		try {
			// Connecting To The MongoDb Server Listening On A Default Port (i.e. 27017).
			MongoClient mongoClntObj = new MongoClient("localhost", 27017);

			// Get MongoDb Database. If The Database Doesn't Exists, MongoDb Will Automatically Create It For You
					DB dbObj = mongoClntObj.getDB("mybookdb");

		// Get MongoDb Collection. If The Collection Doesn't Exists, MongoDb Will Automatically Create It For You
		DBCollection collectionObj = dbObj.getCollection("bookCol");

		/**** READ OPERATION ****/
		// ------------------------------------ Get All Documents ------------------------------------
		DBCursor cursorObj = collectionObj.find();
		try {
			while(cursorObj.hasNext()) {
				System.out.println(cursorObj.next());
			}
		} finally {
			cursorObj.close();
		}// Get MongoDb Collections Count
					System.out.println("Total Number Of MongoDb Collection?=  "+ collectionObj.getCount());
					mongoClntObj.close();
}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
		