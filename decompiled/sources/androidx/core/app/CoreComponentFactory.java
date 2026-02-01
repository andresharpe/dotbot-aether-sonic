package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@androidx.annotation.W(api = 28)
/* loaded from: classes.dex */
public class CoreComponentFactory extends AppComponentFactory {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public interface a {
        Object a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t3) {
        T t4;
        if ((t3 instanceof a) && (t4 = (T) ((a) t3).a()) != null) {
            return t4;
        }
        return t3;
    }

    @androidx.annotation.N
    public Activity instantiateActivity(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str, @androidx.annotation.P Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) a(super.instantiateActivity(classLoader, str, intent));
    }

    @androidx.annotation.N
    public Application instantiateApplication(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) a(super.instantiateApplication(classLoader, str));
    }

    @androidx.annotation.N
    public ContentProvider instantiateProvider(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) a(super.instantiateProvider(classLoader, str));
    }

    @androidx.annotation.N
    public BroadcastReceiver instantiateReceiver(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str, @androidx.annotation.P Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) a(super.instantiateReceiver(classLoader, str, intent));
    }

    @androidx.annotation.N
    public Service instantiateService(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str, @androidx.annotation.P Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) a(super.instantiateService(classLoader, str, intent));
    }
}
