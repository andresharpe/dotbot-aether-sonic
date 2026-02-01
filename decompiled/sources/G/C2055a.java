package g;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2055a implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    private Locale f50378a;

    public C2055a(Context context) {
        this.f50378a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f50378a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i4, Rect rect) {
    }
}
