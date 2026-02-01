package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: P, reason: collision with root package name */
    private int f13857P;

    /* renamed from: Q, reason: collision with root package name */
    private int f13858Q;

    /* renamed from: R, reason: collision with root package name */
    private LayoutInflater f13859R;

    @Deprecated
    public c(Context context, int i4, Cursor cursor) {
        super(context, cursor);
        this.f13858Q = i4;
        this.f13857P = i4;
        this.f13859R = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f13859R.inflate(this.f13858Q, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f13859R.inflate(this.f13857P, viewGroup, false);
    }

    public void n(int i4) {
        this.f13858Q = i4;
    }

    public void o(int i4) {
        this.f13857P = i4;
    }

    @Deprecated
    public c(Context context, int i4, Cursor cursor, boolean z3) {
        super(context, cursor, z3);
        this.f13858Q = i4;
        this.f13857P = i4;
        this.f13859R = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i4, Cursor cursor, int i5) {
        super(context, cursor, i5);
        this.f13858Q = i4;
        this.f13857P = i4;
        this.f13859R = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
