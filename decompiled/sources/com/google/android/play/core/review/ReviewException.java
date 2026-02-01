package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import f1.C2053b;
import java.util.Locale;

/* loaded from: classes2.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i4) {
        super(new Status(i4, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i4), C2053b.a(i4))));
    }

    public int d() {
        return super.b();
    }
}
