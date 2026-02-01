package com.google.firebase.platforminfo;

import com.google.auto.value.AutoValue;
import javax.annotation.Nonnull;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* loaded from: classes2.dex */
public abstract class f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a(String str, String str2) {
        return new a(str, str2);
    }

    @Nonnull
    public abstract String b();

    @Nonnull
    public abstract String c();
}
