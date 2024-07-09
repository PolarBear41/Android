package com.example.irentmovie.databinding;
import com.example.irentmovie.R;
import com.example.irentmovie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCreatePostBindingImpl extends FragmentCreatePostBinding implements com.example.irentmovie.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etDescriptionandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.description.getValue()
            //         is viewModel.description.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etDescription);
            // localize variables for thread safety
            // viewModel.description.getValue()
            java.lang.String viewModelDescriptionGetValue = null;
            // viewModel.description != null
            boolean viewModelDescriptionJavaLangObjectNull = false;
            // viewModel
            com.example.irentmovie.ui.createPost.CreatePostViewModel viewModel = mViewModel;
            // viewModel.description
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDescription = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDescription = viewModel.getDescription();

                viewModelDescriptionJavaLangObjectNull = (viewModelDescription) != (null);
                if (viewModelDescriptionJavaLangObjectNull) {




                    viewModelDescription.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etMovieTypeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.type.getValue()
            //         is viewModel.type.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etMovieType);
            // localize variables for thread safety
            // viewModel.type != null
            boolean viewModelTypeJavaLangObjectNull = false;
            // viewModel.type.getValue()
            java.lang.String viewModelTypeGetValue = null;
            // viewModel
            com.example.irentmovie.ui.createPost.CreatePostViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.type
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelType = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelType = viewModel.getType();

                viewModelTypeJavaLangObjectNull = (viewModelType) != (null);
                if (viewModelTypeJavaLangObjectNull) {




                    viewModelType.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etPeriodandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.period.getValue()
            //         is viewModel.period.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPeriod);
            // localize variables for thread safety
            // viewModel.period
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPeriod = null;
            // viewModel.period.getValue()
            java.lang.String viewModelPeriodGetValue = null;
            // viewModel
            com.example.irentmovie.ui.createPost.CreatePostViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.period != null
            boolean viewModelPeriodJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPeriod = viewModel.getPeriod();

                viewModelPeriodJavaLangObjectNull = (viewModelPeriod) != (null);
                if (viewModelPeriodJavaLangObjectNull) {




                    viewModelPeriod.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etPriceandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.price.getValue()
            //         is viewModel.price.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPrice);
            // localize variables for thread safety
            // viewModel.price.getValue()
            java.lang.String viewModelPriceGetValue = null;
            // viewModel.price != null
            boolean viewModelPriceJavaLangObjectNull = false;
            // viewModel
            com.example.irentmovie.ui.createPost.CreatePostViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.price
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrice = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPrice = viewModel.getPrice();

                viewModelPriceJavaLangObjectNull = (viewModelPrice) != (null);
                if (viewModelPriceJavaLangObjectNull) {




                    viewModelPrice.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentCreatePostBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentCreatePostBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[2]
            );
        this.btnPostAd.setTag(null);
        this.etDescription.setTag(null);
        this.etMovieType.setTag(null);
        this.etPeriod.setTag(null);
        this.etPrice.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.example.irentmovie.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.irentmovie.ui.createPost.CreatePostViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.irentmovie.ui.createPost.CreatePostViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPrice((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPeriod((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelType((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPrice(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPrice, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDescription(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPeriod(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPeriod, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelType(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelPeriodGetValue = null;
        java.lang.String viewModelTypeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrice = null;
        java.lang.String viewModelDescriptionGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDescription = null;
        java.lang.String viewModelPriceGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPeriod = null;
        com.example.irentmovie.ui.createPost.CreatePostViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelType = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.price
                        viewModelPrice = viewModel.getPrice();
                    }
                    updateLiveDataRegistration(0, viewModelPrice);


                    if (viewModelPrice != null) {
                        // read viewModel.price.getValue()
                        viewModelPriceGetValue = viewModelPrice.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.description
                        viewModelDescription = viewModel.getDescription();
                    }
                    updateLiveDataRegistration(1, viewModelDescription);


                    if (viewModelDescription != null) {
                        // read viewModel.description.getValue()
                        viewModelDescriptionGetValue = viewModelDescription.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.period
                        viewModelPeriod = viewModel.getPeriod();
                    }
                    updateLiveDataRegistration(2, viewModelPeriod);


                    if (viewModelPeriod != null) {
                        // read viewModel.period.getValue()
                        viewModelPeriodGetValue = viewModelPeriod.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.type
                        viewModelType = viewModel.getType();
                    }
                    updateLiveDataRegistration(3, viewModelType);


                    if (viewModelType != null) {
                        // read viewModel.type.getValue()
                        viewModelTypeGetValue = viewModelType.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnPostAd.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etDescription, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etDescriptionandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etMovieType, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etMovieTypeandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPeriod, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPeriodandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPrice, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPriceandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etDescription, viewModelDescriptionGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etMovieType, viewModelTypeGetValue);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPeriod, viewModelPeriodGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPrice, viewModelPriceGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.example.irentmovie.ui.createPost.CreatePostViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.create();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.price
        flag 1 (0x2L): viewModel.description
        flag 2 (0x3L): viewModel.period
        flag 3 (0x4L): viewModel.type
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}