package info.airbook.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AirbookOpenHelper extends SQLiteOpenHelper {

	private final static int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "airbook";

	public AirbookOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE IF NOT EXISTS 	contact("
				+ "native_id integer primary key autoincrement ,id varchar, name varchar, "
				+ "base_email  varchar, base_phone varchar, last_name  varchar ,"
				+ "first_name varchar,photo_path varchar,create_time varchar,comment varchar,"
				+ "qq varchar, home_page varchar,addr varchar,  type integer, tags varchar,state integer,pigeohole varchar)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DORP DATABASE IF EXISTS " + DATABASE_NAME);
		onCreate(db);
	}

}
