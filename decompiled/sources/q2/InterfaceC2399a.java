package q2;

import com.harman.rating.model.RatingEventStorage;
import com.harman.rating.model.RatingGuideType;
import com.harman.rating.model.RatingRemoteConfig;
import com.harman.rating.model.UserAction;
import l3.d;
import l3.e;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2399a {
    void a(@d UserAction userAction);

    long b(@d UserAction userAction);

    int c(@d UserAction userAction);

    @e
    RatingRemoteConfig d();

    void e(@d String str, @d String str2);

    @e
    RatingEventStorage f();

    void g();

    int h(@d String str, @d String str2);

    @d
    UserAction i();

    @d
    RatingGuideType j(@d String str);

    boolean k(@d String str);
}
