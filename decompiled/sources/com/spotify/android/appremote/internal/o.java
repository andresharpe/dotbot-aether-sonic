package com.spotify.android.appremote.internal;

import android.content.Context;
import com.spotify.android.appremote.api.error.CouldNotFindSpotifyApp;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes2.dex */
public class o {
    @Nullable
    private static g a() {
        return d("com.spotify.android.appremote.internal.DebugSpotifyLocator");
    }

    @Nullable
    private static g b() {
        return d("com.spotify.android.appremote.internal.ReleaseSpotifyLocator");
    }

    @Nullable
    private static g d(String className) {
        try {
            Class<?> cls = Class.forName(className);
            if (g.class.isAssignableFrom(cls)) {
                return (g) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            return null;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    @Nullable
    public String c(@Nonnull Context context) throws CouldNotFindSpotifyApp {
        g a4 = a();
        if (a4 != null) {
            return a4.a(context);
        }
        g b4 = b();
        if (b4 != null) {
            return b4.a(context);
        }
        throw new CouldNotFindSpotifyApp();
    }

    public boolean e(@Nonnull Context context) {
        try {
            if (c(context) == null) {
                return false;
            }
            return true;
        } catch (CouldNotFindSpotifyApp unused) {
            return false;
        }
    }
}
