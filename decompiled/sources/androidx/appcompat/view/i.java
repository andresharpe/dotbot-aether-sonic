package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class i implements Window.Callback {

    /* renamed from: E, reason: collision with root package name */
    final Window.Callback f5195E;

    @W(23)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @InterfaceC0577u
        static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i4) {
            return callback.onWindowStartingActionMode(callback2, i4);
        }
    }

    @W(24)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i4) {
            callback.onProvideKeyboardShortcuts(list, menu, i4);
        }
    }

    @W(26)
    /* loaded from: classes.dex */
    static class c {
        private c() {
        }

        @InterfaceC0577u
        static void a(Window.Callback callback, boolean z3) {
            callback.onPointerCaptureChanged(z3);
        }
    }

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f5195E = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.f5195E;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f5195E.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f5195E.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f5195E.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f5195E.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f5195E.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f5195E.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f5195E.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f5195E.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f5195E.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f5195E.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i4, Menu menu) {
        return this.f5195E.onCreatePanelMenu(i4, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i4) {
        return this.f5195E.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f5195E.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f5195E.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i4, Menu menu) {
        return this.f5195E.onMenuOpened(i4, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i4, Menu menu) {
        this.f5195E.onPanelClosed(i4, menu);
    }

    @Override // android.view.Window.Callback
    @W(26)
    public void onPointerCaptureChanged(boolean z3) {
        c.a(this.f5195E, z3);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i4, View view, Menu menu) {
        return this.f5195E.onPreparePanel(i4, view, menu);
    }

    @Override // android.view.Window.Callback
    @W(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i4) {
        b.a(this.f5195E, list, menu, i4);
    }

    @Override // android.view.Window.Callback
    @W(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f5195E, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f5195E.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        this.f5195E.onWindowFocusChanged(z3);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f5195E.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f5195E.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @W(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        return a.b(this.f5195E, callback, i4);
    }
}
