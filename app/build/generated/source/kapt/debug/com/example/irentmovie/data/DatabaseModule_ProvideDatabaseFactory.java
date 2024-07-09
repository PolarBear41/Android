
package com.example.irentmovie.data;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<AppDatabase> {
  private final Provider<Context> appContextProvider;

  public DatabaseModule_ProvideDatabaseFactory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public AppDatabase get() {
    return provideDatabase(appContextProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseFactory create(Provider<Context> appContextProvider) {
    return new DatabaseModule_ProvideDatabaseFactory(appContextProvider);
  }

  public static AppDatabase provideDatabase(Context appContext) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideDatabase(appContext));
  }
}
