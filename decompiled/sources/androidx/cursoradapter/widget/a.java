package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.annotation.RestrictTo;
import androidx.cursoradapter.widget.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: N, reason: collision with root package name */
    @Deprecated
    public static final int f13843N = 1;

    /* renamed from: O, reason: collision with root package name */
    public static final int f13844O = 2;

    /* renamed from: E, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean f13845E;

    /* renamed from: F, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean f13846F;

    /* renamed from: G, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected Cursor f13847G;

    /* renamed from: H, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected Context f13848H;

    /* renamed from: I, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected int f13849I;

    /* renamed from: J, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected C0113a f13850J;

    /* renamed from: K, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected DataSetObserver f13851K;

    /* renamed from: L, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected androidx.cursoradapter.widget.b f13852L;

    /* renamed from: M, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected FilterQueryProvider f13853M;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.cursoradapter.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0113a extends ContentObserver {
        C0113a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            a.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f13845E = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f13845E = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        g(context, cursor, 1);
    }

    public CharSequence a(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public void b(Cursor cursor) {
        Cursor m4 = m(cursor);
        if (m4 != null) {
            m4.close();
        }
    }

    @Override // androidx.cursoradapter.widget.b.a
    public Cursor c() {
        return this.f13847G;
    }

    public Cursor d(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f13853M;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.f13847G;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    public FilterQueryProvider f() {
        return this.f13853M;
    }

    void g(Context context, Cursor cursor, int i4) {
        int i5;
        boolean z3 = false;
        if ((i4 & 1) == 1) {
            i4 |= 2;
            this.f13846F = true;
        } else {
            this.f13846F = false;
        }
        if (cursor != null) {
            z3 = true;
        }
        this.f13847G = cursor;
        this.f13845E = z3;
        this.f13848H = context;
        if (z3) {
            i5 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i5 = -1;
        }
        this.f13849I = i5;
        if ((i4 & 2) == 2) {
            this.f13850J = new C0113a();
            this.f13851K = new b();
        } else {
            this.f13850J = null;
            this.f13851K = null;
        }
        if (z3) {
            C0113a c0113a = this.f13850J;
            if (c0113a != null) {
                cursor.registerContentObserver(c0113a);
            }
            DataSetObserver dataSetObserver = this.f13851K;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (this.f13845E && (cursor = this.f13847G) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (this.f13845E) {
            this.f13847G.moveToPosition(i4);
            if (view == null) {
                view = i(this.f13848H, this.f13847G, viewGroup);
            }
            e(view, this.f13848H, this.f13847G);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f13852L == null) {
            this.f13852L = new androidx.cursoradapter.widget.b(this);
        }
        return this.f13852L;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        Cursor cursor;
        if (this.f13845E && (cursor = this.f13847G) != null) {
            cursor.moveToPosition(i4);
            return this.f13847G;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        Cursor cursor;
        if (!this.f13845E || (cursor = this.f13847G) == null || !cursor.moveToPosition(i4)) {
            return 0L;
        }
        return this.f13847G.getLong(this.f13849I);
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (this.f13845E) {
            if (this.f13847G.moveToPosition(i4)) {
                if (view == null) {
                    view = j(this.f13848H, this.f13847G, viewGroup);
                }
                e(view, this.f13848H, this.f13847G);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i4);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    @Deprecated
    protected void h(Context context, Cursor cursor, boolean z3) {
        int i4;
        if (z3) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        g(context, cursor, i4);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return j(context, cursor, viewGroup);
    }

    public abstract View j(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void k() {
        Cursor cursor;
        if (this.f13846F && (cursor = this.f13847G) != null && !cursor.isClosed()) {
            this.f13845E = this.f13847G.requery();
        }
    }

    public void l(FilterQueryProvider filterQueryProvider) {
        this.f13853M = filterQueryProvider;
    }

    public Cursor m(Cursor cursor) {
        Cursor cursor2 = this.f13847G;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0113a c0113a = this.f13850J;
            if (c0113a != null) {
                cursor2.unregisterContentObserver(c0113a);
            }
            DataSetObserver dataSetObserver = this.f13851K;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f13847G = cursor;
        if (cursor != null) {
            C0113a c0113a2 = this.f13850J;
            if (c0113a2 != null) {
                cursor.registerContentObserver(c0113a2);
            }
            DataSetObserver dataSetObserver2 = this.f13851K;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f13849I = cursor.getColumnIndexOrThrow("_id");
            this.f13845E = true;
            notifyDataSetChanged();
        } else {
            this.f13849I = -1;
            this.f13845E = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public a(Context context, Cursor cursor, boolean z3) {
        g(context, cursor, z3 ? 1 : 2);
    }

    public a(Context context, Cursor cursor, int i4) {
        g(context, cursor, i4);
    }
}
