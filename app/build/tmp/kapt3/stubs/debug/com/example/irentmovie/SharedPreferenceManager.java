package com.example.irentmovie;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0011J\r\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/example/irentmovie/SharedPreferenceManager;", "", "()V", "ARG_TOKEN", "", "SESSION_FILE_NAME", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "Lkotlin/Lazy;", "readString", "key", "readToken", "remove", "", "(Ljava/lang/String;)Lkotlin/Unit;", "removeToken", "()Lkotlin/Unit;", "write", "value", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "writeToken", "app_debug"})
public final class SharedPreferenceManager {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ARG_TOKEN = "ARG_TOKEN";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SESSION_FILE_NAME = "movie-rent";
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy sharedPreferences$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.irentmovie.SharedPreferenceManager INSTANCE = null;
    
    private SharedPreferenceManager() {
        super();
    }
    
    private final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void writeToken(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    private final kotlin.Unit write(java.lang.String key, java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String readToken() {
        return null;
    }
    
    private final java.lang.String readString(java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.Unit removeToken() {
        return null;
    }
    
    private final kotlin.Unit remove(java.lang.String key) {
        return null;
    }
}