package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: S, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int[] f13860S;

    /* renamed from: T, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int[] f13861T;

    /* renamed from: U, reason: collision with root package name */
    private int f13862U;

    /* renamed from: V, reason: collision with root package name */
    private a f13863V;

    /* renamed from: W, reason: collision with root package name */
    private b f13864W;

    /* renamed from: X, reason: collision with root package name */
    String[] f13865X;

    /* loaded from: classes.dex */
    public interface a {
        CharSequence a(Cursor cursor);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(View view, Cursor cursor, int i4);
    }

    @Deprecated
    public d(Context context, int i4, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i4, cursor);
        this.f13862U = -1;
        this.f13861T = iArr;
        this.f13865X = strArr;
        q(cursor, strArr);
    }

    private void q(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.f13860S;
            if (iArr == null || iArr.length != length) {
                this.f13860S = new int[length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                this.f13860S[i4] = cursor.getColumnIndexOrThrow(strArr[i4]);
            }
            return;
        }
        this.f13860S = null;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence a(Cursor cursor) {
        a aVar = this.f13863V;
        if (aVar != null) {
            return aVar.a(cursor);
        }
        int i4 = this.f13862U;
        if (i4 > -1) {
            return cursor.getString(i4);
        }
        return super.a(cursor);
    }

    @Override // androidx.cursoradapter.widget.a
    public void e(View view, Context context, Cursor cursor) {
        b bVar = this.f13864W;
        int[] iArr = this.f13861T;
        int length = iArr.length;
        int[] iArr2 = this.f13860S;
        for (int i4 = 0; i4 < length; i4++) {
            View findViewById = view.findViewById(iArr[i4]);
            if (findViewById != null && (bVar == null || !bVar.a(findViewById, cursor, iArr2[i4]))) {
                String string = cursor.getString(iArr2[i4]);
                if (string == null) {
                    string = "";
                }
                if (findViewById instanceof TextView) {
                    y((TextView) findViewById, string);
                } else if (findViewById instanceof ImageView) {
                    x((ImageView) findViewById, string);
                } else {
                    throw new IllegalStateException(findViewById.getClass().getName() + " is not a  view that can be bounds by this SimpleCursorAdapter");
                }
            }
        }
    }

    @Override // androidx.cursoradapter.widget.a
    public Cursor m(Cursor cursor) {
        q(cursor, this.f13865X);
        return super.m(cursor);
    }

    public void p(Cursor cursor, String[] strArr, int[] iArr) {
        this.f13865X = strArr;
        this.f13861T = iArr;
        q(cursor, strArr);
        super.b(cursor);
    }

    public a r() {
        return this.f13863V;
    }

    public int s() {
        return this.f13862U;
    }

    public b t() {
        return this.f13864W;
    }

    public void u(a aVar) {
        this.f13863V = aVar;
    }

    public void v(int i4) {
        this.f13862U = i4;
    }

    public void w(b bVar) {
        this.f13864W = bVar;
    }

    public void x(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void y(TextView textView, String str) {
        textView.setText(str);
    }

    public d(Context context, int i4, Cursor cursor, String[] strArr, int[] iArr, int i5) {
        super(context, i4, cursor, i5);
        this.f13862U = -1;
        this.f13861T = iArr;
        this.f13865X = strArr;
        q(cursor, strArr);
    }
}
