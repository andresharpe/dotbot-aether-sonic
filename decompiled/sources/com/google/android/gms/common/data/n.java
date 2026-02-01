package com.google.android.gms.common.data;

import android.content.ContentValues;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;

/* loaded from: classes.dex */
final class n extends DataHolder.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(String[] strArr, String str) {
        super(strArr, null, null);
    }

    @Override // com.google.android.gms.common.data.DataHolder.a
    public final DataHolder.a c(ContentValues contentValues) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }

    @Override // com.google.android.gms.common.data.DataHolder.a
    public final DataHolder.a d(HashMap<String, Object> hashMap) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }
}
