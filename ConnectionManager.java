import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DefaultDBCallback;
import com.mongodb.MongoClient;

public class ConnectionManager {

	public static void main(String[] args) {
		
		MongoClient mc = new MongoClient("localhost",27017);
		
		DB db = mc.getDB("test");
		
		DBCollection dbCollection = db.getCollection("test");
		
		if(dbCollection != null)
		{
			System.out.println("Connection Established");
		}
	}

}
