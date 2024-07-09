package com.example.irentmovie.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/example/irentmovie/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "modelDao", "Lcom/example/irentmovie/data/dao/ModelDao;", "postDao", "Lcom/example/irentmovie/data/dao/PostDao;", "userDao", "Lcom/example/irentmovie/data/dao/UserDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.example.irentmovie.data.models.User.class, com.example.irentmovie.data.models.Post.class, com.example.irentmovie.data.api.PostAPIModel.class}, version = 3)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_NAME = "movie_database";
    @org.jetbrains.annotations.NotNull
    public static final com.example.irentmovie.data.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.irentmovie.data.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.irentmovie.data.dao.PostDao postDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.irentmovie.data.dao.ModelDao modelDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/irentmovie/data/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}