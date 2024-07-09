package com.example.irentmovie.ui.productList;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/example/irentmovie/ui/productList/ProductListViewModel;", "Landroidx/lifecycle/ViewModel;", "postRepository", "Lcom/example/irentmovie/data/repositories/PostRepository;", "modelRepository", "Lcom/example/irentmovie/data/repositories/ModelRepository;", "(Lcom/example/irentmovie/data/repositories/PostRepository;Lcom/example/irentmovie/data/repositories/ModelRepository;)V", "_posts", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/irentmovie/data/models/Post;", "posts", "Landroidx/lifecycle/LiveData;", "getPosts", "()Landroidx/lifecycle/LiveData;", "handleProductsResponse", "", "response", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProductListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.irentmovie.data.repositories.PostRepository postRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.irentmovie.data.repositories.ModelRepository modelRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.irentmovie.data.models.Post>> _posts = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.irentmovie.data.models.Post>> posts = null;
    
    @javax.inject.Inject
    public ProductListViewModel(@org.jetbrains.annotations.NotNull
    com.example.irentmovie.data.repositories.PostRepository postRepository, @org.jetbrains.annotations.NotNull
    com.example.irentmovie.data.repositories.ModelRepository modelRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.irentmovie.data.models.Post>> getPosts() {
        return null;
    }
    
    private final void handleProductsResponse(java.lang.String response) {
    }
}