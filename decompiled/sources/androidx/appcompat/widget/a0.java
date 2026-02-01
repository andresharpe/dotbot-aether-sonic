package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0669d;
import com.google.firebase.analytics.FirebaseAnalytics;
import d.C2042a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class a0 extends androidx.cursoradapter.widget.c implements View.OnClickListener {

    /* renamed from: g0, reason: collision with root package name */
    private static final boolean f6072g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    private static final String f6073h0 = "SuggestionsAdapter";

    /* renamed from: i0, reason: collision with root package name */
    private static final int f6074i0 = 50;

    /* renamed from: j0, reason: collision with root package name */
    static final int f6075j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    static final int f6076k0 = 1;

    /* renamed from: l0, reason: collision with root package name */
    static final int f6077l0 = 2;

    /* renamed from: m0, reason: collision with root package name */
    static final int f6078m0 = -1;

    /* renamed from: S, reason: collision with root package name */
    private final SearchView f6079S;

    /* renamed from: T, reason: collision with root package name */
    private final SearchableInfo f6080T;

    /* renamed from: U, reason: collision with root package name */
    private final Context f6081U;

    /* renamed from: V, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f6082V;

    /* renamed from: W, reason: collision with root package name */
    private final int f6083W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f6084X;

    /* renamed from: Y, reason: collision with root package name */
    private int f6085Y;

    /* renamed from: Z, reason: collision with root package name */
    private ColorStateList f6086Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f6087a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f6088b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f6089c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f6090d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f6091e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f6092f0;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f6093a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f6094b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f6095c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f6096d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f6097e;

        public a(View view) {
            this.f6093a = (TextView) view.findViewById(R.id.text1);
            this.f6094b = (TextView) view.findViewById(R.id.text2);
            this.f6095c = (ImageView) view.findViewById(R.id.icon1);
            this.f6096d = (ImageView) view.findViewById(R.id.icon2);
            this.f6097e = (ImageView) view.findViewById(C2042a.g.f49666z);
        }
    }

    public a0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f6084X = false;
        this.f6085Y = 1;
        this.f6087a0 = -1;
        this.f6088b0 = -1;
        this.f6089c0 = -1;
        this.f6090d0 = -1;
        this.f6091e0 = -1;
        this.f6092f0 = -1;
        this.f6079S = searchView;
        this.f6080T = searchableInfo;
        this.f6083W = searchView.getSuggestionCommitIconResId();
        this.f6081U = context;
        this.f6082V = weakHashMap;
    }

    private Drawable A(Cursor cursor) {
        int i4 = this.f6091e0;
        if (i4 == -1) {
            return null;
        }
        return y(cursor.getString(i4));
    }

    private static String D(Cursor cursor, int i4) {
        if (i4 == -1) {
            return null;
        }
        try {
            return cursor.getString(i4);
        } catch (Exception e4) {
            Log.e(f6073h0, "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    private void F(ImageView imageView, Drawable drawable, int i4) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i4);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void G(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void H(String str, Drawable drawable) {
        if (drawable != null) {
            this.f6082V.put(str, drawable.getConstantState());
        }
    }

    private void I(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    private Drawable p(String str) {
        Drawable.ConstantState constantState = this.f6082V.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence r(CharSequence charSequence) {
        if (this.f6086Z == null) {
            TypedValue typedValue = new TypedValue();
            this.f6081U.getTheme().resolveAttribute(C2042a.b.x3, typedValue, true);
            this.f6086Z = this.f6081U.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f6086Z, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable s(ComponentName componentName) {
        PackageManager packageManager = this.f6081U.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                Log.w(f6073h0, "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w(f6073h0, e4.toString());
            return null;
        }
    }

    private Drawable t(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f6082V.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f6082V.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f6081U.getResources());
        }
        Drawable s4 = s(componentName);
        if (s4 != null) {
            constantState = s4.getConstantState();
        }
        this.f6082V.put(flattenToShortString, constantState);
        return s4;
    }

    public static String u(Cursor cursor, String str) {
        return D(cursor, cursor.getColumnIndex(str));
    }

    private Drawable v() {
        Drawable t3 = t(this.f6080T.getSearchActivity());
        if (t3 != null) {
            return t3;
        }
        return this.f6081U.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable w(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return x(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f6081U.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                try {
                    return Drawable.createFromStream(openInputStream, null);
                } finally {
                    try {
                        openInputStream.close();
                    } catch (IOException e4) {
                        Log.e(f6073h0, "Error closing icon stream for " + uri, e4);
                    }
                }
            }
            throw new FileNotFoundException("Failed to open " + uri);
        } catch (FileNotFoundException e5) {
            Log.w(f6073h0, "Icon not found: " + uri + ", " + e5.getMessage());
            return null;
        }
        Log.w(f6073h0, "Icon not found: " + uri + ", " + e5.getMessage());
        return null;
    }

    private Drawable y(String str) {
        if (str == null || str.isEmpty() || com.harman.jbl.partybox.ui.effectlab.a.f43472q.equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f6081U.getPackageName() + "/" + parseInt;
            Drawable p4 = p(str2);
            if (p4 != null) {
                return p4;
            }
            Drawable i4 = C0669d.i(this.f6081U, parseInt);
            H(str2, i4);
            return i4;
        } catch (Resources.NotFoundException unused) {
            Log.w(f6073h0, "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable p5 = p(str);
            if (p5 != null) {
                return p5;
            }
            Drawable w3 = w(Uri.parse(str));
            H(str, w3);
            return w3;
        }
    }

    private Drawable z(Cursor cursor) {
        int i4 = this.f6090d0;
        if (i4 == -1) {
            return null;
        }
        Drawable y3 = y(cursor.getString(i4));
        if (y3 != null) {
            return y3;
        }
        return v();
    }

    public int B() {
        return this.f6085Y;
    }

    Cursor C(SearchableInfo searchableInfo, String str, int i4) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(FirebaseAnalytics.b.f34769P).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i4 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i4));
        }
        return this.f6081U.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void E(int i4) {
        this.f6085Y = i4;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence a(Cursor cursor) {
        String u3;
        String u4;
        if (cursor == null) {
            return null;
        }
        String u5 = u(cursor, "suggest_intent_query");
        if (u5 != null) {
            return u5;
        }
        if (this.f6080T.shouldRewriteQueryFromData() && (u4 = u(cursor, "suggest_intent_data")) != null) {
            return u4;
        }
        if (!this.f6080T.shouldRewriteQueryFromText() || (u3 = u(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return u3;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public void b(Cursor cursor) {
        if (this.f6084X) {
            Log.w(f6073h0, "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f6087a0 = cursor.getColumnIndex("suggest_text_1");
                this.f6088b0 = cursor.getColumnIndex("suggest_text_2");
                this.f6089c0 = cursor.getColumnIndex("suggest_text_2_url");
                this.f6090d0 = cursor.getColumnIndex("suggest_icon_1");
                this.f6091e0 = cursor.getColumnIndex("suggest_icon_2");
                this.f6092f0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e(f6073h0, "error changing cursor and caching columns", e4);
        }
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (this.f6079S.getVisibility() == 0 && this.f6079S.getWindowVisibility() == 0) {
            try {
                Cursor C3 = C(this.f6080T, charSequence2, 50);
                if (C3 != null) {
                    C3.getCount();
                    return C3;
                }
            } catch (RuntimeException e4) {
                Log.w(f6073h0, "Search suggestions query threw an exception.", e4);
            }
        }
        return null;
    }

    @Override // androidx.cursoradapter.widget.a
    public void e(View view, Context context, Cursor cursor) {
        int i4;
        CharSequence D3;
        a aVar = (a) view.getTag();
        int i5 = this.f6092f0;
        if (i5 != -1) {
            i4 = cursor.getInt(i5);
        } else {
            i4 = 0;
        }
        if (aVar.f6093a != null) {
            G(aVar.f6093a, D(cursor, this.f6087a0));
        }
        if (aVar.f6094b != null) {
            String D4 = D(cursor, this.f6089c0);
            if (D4 != null) {
                D3 = r(D4);
            } else {
                D3 = D(cursor, this.f6088b0);
            }
            if (TextUtils.isEmpty(D3)) {
                TextView textView = aVar.f6093a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f6093a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f6093a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f6093a.setMaxLines(1);
                }
            }
            G(aVar.f6094b, D3);
        }
        ImageView imageView = aVar.f6095c;
        if (imageView != null) {
            F(imageView, z(cursor), 4);
        }
        ImageView imageView2 = aVar.f6096d;
        if (imageView2 != null) {
            F(imageView2, A(cursor), 8);
        }
        int i6 = this.f6085Y;
        if (i6 != 2 && (i6 != 1 || (i4 & 1) == 0)) {
            aVar.f6097e.setVisibility(8);
            return;
        }
        aVar.f6097e.setVisibility(0);
        aVar.f6097e.setTag(aVar.f6093a.getText());
        aVar.f6097e.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w(f6073h0, "Search suggestions cursor threw exception.", e4);
            View i5 = i(this.f6081U, c(), viewGroup);
            if (i5 != null) {
                ((a) i5.getTag()).f6093a.setText(e4.toString());
            }
            return i5;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i4, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w(f6073h0, "Search suggestions cursor threw exception.", e4);
            View j4 = j(this.f6081U, c(), viewGroup);
            if (j4 != null) {
                ((a) j4.getTag()).f6093a.setText(e4.toString());
            }
            return j4;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // androidx.cursoradapter.widget.c, androidx.cursoradapter.widget.a
    public View j(Context context, Cursor cursor, ViewGroup viewGroup) {
        View j4 = super.j(context, cursor, viewGroup);
        j4.setTag(new a(j4));
        ((ImageView) j4.findViewById(C2042a.g.f49666z)).setImageResource(this.f6083W);
        return j4;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        I(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        I(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f6079S.b0((CharSequence) tag);
        }
    }

    public void q() {
        b(null);
        this.f6084X = true;
    }

    Drawable x(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f6081U.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }
}
