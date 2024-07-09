
package com.example.irentmovie.ui.register;

import com.example.irentmovie.data.repositories.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public RegisterViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static RegisterViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new RegisterViewModel_Factory(userRepositoryProvider);
  }

  public static RegisterViewModel newInstance(UserRepository userRepository) {
    return new RegisterViewModel(userRepository);
  }
}
