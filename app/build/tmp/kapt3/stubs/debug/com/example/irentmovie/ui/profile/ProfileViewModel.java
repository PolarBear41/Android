package com.example.irentmovie.ui.profile;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/example/irentmovie/ui/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "postRepository", "Lcom/example/irentmovie/data/repositories/PostRepository;", "userRepository", "Lcom/example/irentmovie/data/repositories/UserRepository;", "(Lcom/example/irentmovie/data/repositories/PostRepository;Lcom/example/irentmovie/data/repositories/UserRepository;)V", "_email", "Landroidx/lifecycle/MutableLiveData;", "", "_username", "email", "Landroidx/lifecycle/LiveData;", "getEmail", "()Landroidx/lifecycle/LiveData;", "username", "getUsername", "deleteProfile", "", "setInitialValues", "updateProfile", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.irentmovie.data.repositories.PostRepository postRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.irentmovie.data.repositories.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _username = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _email = null;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    com.example.irentmovie.data.repositories.PostRepository postRepository, @org.jetbrains.annotations.NotNull
    com.example.irentmovie.data.repositories.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getEmail() {
        return null;
    }
    
    public final void updateProfile() {
    }
    
    public final void deleteProfile() {
    }
    
    public final void setInitialValues(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String email) {
    }
}