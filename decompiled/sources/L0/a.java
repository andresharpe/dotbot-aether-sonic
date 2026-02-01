package L0;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import androidx.annotation.N;
import androidx.annotation.P;

@I0.a
/* loaded from: classes.dex */
public class a extends CursorWrapper implements CrossProcessCursor {

    /* renamed from: E, reason: collision with root package name */
    private AbstractWindowedCursor f1451E;

    @I0.a
    public a(@N Cursor cursor) {
        super(cursor);
        for (int i4 = 0; i4 < 10 && (cursor instanceof CursorWrapper); i4++) {
            cursor = ((CursorWrapper) cursor).getWrappedCursor();
        }
        if (cursor instanceof AbstractWindowedCursor) {
            this.f1451E = (AbstractWindowedCursor) cursor;
            return;
        }
        throw new IllegalArgumentException("Unknown type: ".concat(cursor.getClass().getName()));
    }

    @I0.a
    public void a(@P CursorWindow cursorWindow) {
        this.f1451E.setWindow(cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @I0.a
    public void fillWindow(int i4, @N CursorWindow cursorWindow) {
        this.f1451E.fillWindow(i4, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @P
    @I0.a
    public CursorWindow getWindow() {
        return this.f1451E.getWindow();
    }

    @Override // android.database.CursorWrapper
    @N
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.f1451E;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i4, int i5) {
        return this.f1451E.onMove(i4, i5);
    }
}
