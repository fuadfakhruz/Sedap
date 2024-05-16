package com.tekkom22.sedap.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.tekkom22.sedap.dao.DatabaseDao;
import com.tekkom22.sedap.model.ModelDatabase;



@Database(entities = {ModelDatabase.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
