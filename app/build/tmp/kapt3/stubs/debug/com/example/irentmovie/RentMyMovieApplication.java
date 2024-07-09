package com.example.irentmovie;

@dagger.hilt.android.HiltAndroidApp
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/irentmovie/RentMyMovieApplication;", "Landroid/app/Application;", "()V", "appDatabase", "Lcom/example/irentmovie/data/AppDatabase;", "getAppDatabase", "()Lcom/example/irentmovie/data/AppDatabase;", "setAppDatabase", "(Lcom/example/irentmovie/data/AppDatabase;)V", "onCreate", "", "Companion", "app_debug"})
public final class RentMyMovieApplication extends android.app.Application {
    public com.example.irentmovie.data.AppDatabase appDatabase;
    @org.jetbrains.annotations.Nullable
    private static com.example.irentmovie.RentMyMovieApplication instance;
    @org.jetbrains.annotations.NotNull
    public static final com.example.irentmovie.RentMyMovieApplication.Companion Companion = null;
    
    public RentMyMovieApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.irentmovie.data.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.NotNull
    com.example.irentmovie.data.AppDatabase p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/irentmovie/RentMyMovieApplication$Companion;", "", "()V", "<set-?>", "Lcom/example/irentmovie/RentMyMovieApplication;", "instance", "getInstance", "()Lcom/example/irentmovie/RentMyMovieApplication;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.irentmovie.RentMyMovieApplication getInstance() {
            return null;
        }
    }
}