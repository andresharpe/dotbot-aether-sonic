package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.F;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.util.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f14567a;

    /* renamed from: b, reason: collision with root package name */
    private int f14568b;

    /* renamed from: c, reason: collision with root package name */
    private int f14569c;

    @W(19)
    /* renamed from: androidx.emoji2.viewsintegration.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0129a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f14570a;

        /* renamed from: b, reason: collision with root package name */
        private final g f14571b;

        C0129a(@N EditText editText, boolean z3) {
            this.f14570a = editText;
            g gVar = new g(editText, z3);
            this.f14571b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(androidx.emoji2.viewsintegration.b.getInstance());
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        KeyListener a(@P KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new e(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        boolean b() {
            return this.f14571b.d();
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        InputConnection c(@N InputConnection inputConnection, @N EditorInfo editorInfo) {
            if (inputConnection instanceof c) {
                return inputConnection;
            }
            return new c(this.f14570a, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void d(int i4) {
            this.f14571b.f(i4);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void e(boolean z3) {
            this.f14571b.g(z3);
        }

        @Override // androidx.emoji2.viewsintegration.a.b
        void f(int i4) {
            this.f14571b.h(i4);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        @P
        KeyListener a(@P KeyListener keyListener) {
            return keyListener;
        }

        boolean b() {
            return false;
        }

        InputConnection c(@N InputConnection inputConnection, @N EditorInfo editorInfo) {
            return inputConnection;
        }

        void d(int i4) {
        }

        void e(boolean z3) {
        }

        void f(int i4) {
        }
    }

    public a(@N EditText editText) {
        this(editText, true);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int a() {
        return this.f14569c;
    }

    @P
    public KeyListener b(@P KeyListener keyListener) {
        return this.f14567a.a(keyListener);
    }

    public int c() {
        return this.f14568b;
    }

    public boolean d() {
        return this.f14567a.b();
    }

    @P
    public InputConnection e(@P InputConnection inputConnection, @N EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f14567a.c(inputConnection, editorInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void f(int i4) {
        this.f14569c = i4;
        this.f14567a.d(i4);
    }

    public void g(boolean z3) {
        this.f14567a.e(z3);
    }

    public void h(@F(from = 0) int i4) {
        u.j(i4, "maxEmojiCount should be greater than 0");
        this.f14568b = i4;
        this.f14567a.f(i4);
    }

    public a(@N EditText editText, boolean z3) {
        this.f14568b = Integer.MAX_VALUE;
        this.f14569c = 0;
        u.m(editText, "editText cannot be null");
        this.f14567a = new C0129a(editText, z3);
    }
}
