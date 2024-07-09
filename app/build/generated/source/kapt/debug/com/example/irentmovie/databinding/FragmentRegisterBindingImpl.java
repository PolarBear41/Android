package com.example.irentmovie.databinding;
import com.example.irentmovie.R;
import com.example.irentmovie.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding implements com.example.irentmovie.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ly_form_data, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.password.getValue()
            //         is viewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etPassword);
            // localize variables for thread safety
            // viewModel.password != null
            boolean viewModelPasswordJavaLangObjectNull = false;
            // viewModel.password.getValue()
            java.lang.String viewModelPasswordGetValue = null;
            // viewModel
            com.example.irentmovie.ui.register.RegisterViewModel viewModel = mViewModel;
            // viewModel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPassword = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPassword = viewModel.getPassword();

                viewModelPasswordJavaLangObjectNull = (viewModelPassword) != (null);
                if (viewModelPasswordJavaLangObjectNull) {




                    viewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etUsernameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.username.getValue()
            //         is viewModel.username.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etUsername);
            // localize variables for thread safety
            // viewModel.username != null
            boolean viewModelUsernameJavaLangObjectNull = false;
            // viewModel.username.getValue()
            java.lang.String viewModelUsernameGetValue = null;
            // viewModel
            com.example.irentmovie.ui.register.RegisterViewModel viewModel = mViewModel;
            // viewModel.username
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsername = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUsername = viewModel.getUsername();

                viewModelUsernameJavaLangObjectNull = (viewModelUsername) != (null);
                if (viewModelUsernameJavaLangObjectNull) {




                    viewModelUsername.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.TextView) bindings[4]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            );
        this.btnRegister.setTag(null);
        this.etPassword.setTag(null);
        this.etUsername.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.example.irentmovie.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.example.irentmovie.ui.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.irentmovie.ui.register.RegisterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUsername((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelIsUsernameError((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUsername(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsUsernameError(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsUsernameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.Boolean viewModelIsUsernameErrorGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsUsernameErrorGetValue = false;
        java.lang.String viewModelPasswordGetValue = null;
        java.lang.String viewModelUsernameGetValue = null;
        int viewModelIsUsernameErrorViewVISIBLEViewGONE = 0;
        com.example.irentmovie.ui.register.RegisterViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsername = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsUsernameError = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPassword = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.username
                        viewModelUsername = viewModel.getUsername();
                    }
                    updateLiveDataRegistration(0, viewModelUsername);


                    if (viewModelUsername != null) {
                        // read viewModel.username.getValue()
                        viewModelUsernameGetValue = viewModelUsername.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isUsernameError
                        viewModelIsUsernameError = viewModel.isUsernameError();
                    }
                    updateLiveDataRegistration(1, viewModelIsUsernameError);


                    if (viewModelIsUsernameError != null) {
                        // read viewModel.isUsernameError.getValue()
                        viewModelIsUsernameErrorGetValue = viewModelIsUsernameError.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUsernameError.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsUsernameErrorGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsUsernameErrorGetValue);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsUsernameErrorGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUsernameError.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsUsernameErrorViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsUsernameErrorGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.password
                        viewModelPassword = viewModel.getPassword();
                    }
                    updateLiveDataRegistration(2, viewModelPassword);


                    if (viewModelPassword != null) {
                        // read viewModel.password.getValue()
                        viewModelPasswordGetValue = viewModelPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnRegister.setOnClickListener(mCallback7);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etUsername, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etUsernameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etPassword, viewModelPasswordGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etUsername, viewModelUsernameGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelIsUsernameErrorViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.example.irentmovie.ui.register.RegisterViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.register();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.username
        flag 1 (0x2L): viewModel.isUsernameError
        flag 2 (0x3L): viewModel.password
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUsernameError.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUsernameError.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}