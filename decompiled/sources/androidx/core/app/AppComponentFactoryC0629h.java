package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import java.lang.reflect.InvocationTargetException;

@androidx.annotation.W(28)
/* renamed from: androidx.core.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class AppComponentFactoryC0629h extends AppComponentFactory {
    @androidx.annotation.N
    public Activity a(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str, @androidx.annotation.P Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.N
    public Application b(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.N
    public ContentProvider c(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.N
    public BroadcastReceiver d(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str, @androidx.annotation.P Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.N
    public Service e(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str, @androidx.annotation.P Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return (Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException("Couldn't call constructor", e4);
        }
    }

    @androidx.annotation.N
    public final Activity instantiateActivity(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str, @androidx.annotation.P Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) CoreComponentFactory.a(a(classLoader, str, intent));
    }

    @androidx.annotation.N
    public final Application instantiateApplication(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) CoreComponentFactory.a(b(classLoader, str));
    }

    @androidx.annotation.N
    public final ContentProvider instantiateProvider(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) CoreComponentFactory.a(c(classLoader, str));
    }

    @androidx.annotation.N
    public final BroadcastReceiver instantiateReceiver(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str, @androidx.annotation.P Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) CoreComponentFactory.a(d(classLoader, str, intent));
    }

    @androidx.annotation.N
    public final Service instantiateService(@androidx.annotation.N ClassLoader classLoader, @androidx.annotation.N String str, @androidx.annotation.P Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) CoreComponentFactory.a(e(classLoader, str, intent));
    }
}
