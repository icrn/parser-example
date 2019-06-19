package icrn;

import icrn.exception.JsonParseException;
import icrn.parse.Parse;

import java.io.IOException;

/**
 * Created by yan on 2016/11/10.
 */
public class ParserTest {


    public static void main(String[] args) throws IOException, JsonParseException {
        String json = "{\"date\":\"20161024\",\"stories\":[{\"images\":[\"http:\\/\\/pic2.zhimg.com\\/121d38a2c723528c69bf325770fc04f1.jpg\"],\"type\":0,\"id\":8913228,\"ga_prefix\":\"102411\",\"title\":\"�о�������б���ϻ����ĸ������⣬�Կ������ͦ����\"},{\"images\":[\"http:\\/\\/pic1.zhimg.com\\/a81dd2b0675d9800154cdb5a37f429ec.jpg\"],\"type\":0,\"id\":8913482,\"ga_prefix\":\"102410\",\"title\":\"��ÿ�춼���۸�������У԰�������Ҹ���ô�죿��\"},{\"images\":[\"http:\\/\\/pic1.zhimg.com\\/c69d7ee8bc8c543489571d6896869a6c.jpg\"],\"type\":0,\"id\":8913325,\"ga_prefix\":\"102409\",\"title\":\"�������Ҫ������������飬С�ı���������ϡ���\"},{\"images\":[\"http:\\/\\/pic2.zhimg.com\\/da74bb5016d13c52bd506476b2497f91.jpg\"],\"type\":0,\"id\":8913221,\"ga_prefix\":\"102408\",\"title\":\"����ϵ�;���ϵ�������ſΣ����ξ���ѧ�����ıߵģ�\"},{\"images\":[\"http:\\/\\/pic4.zhimg.com\\/910ea288ebab555d2e1ab5712aea571f.jpg\"],\"type\":0,\"id\":8913218,\"ga_prefix\":\"102407\",\"title\":\"�������磬�Ժ����֣���������Ӱʦ��ֻ�ǣ��������ð�\"},{\"images\":[\"http:\\/\\/pic3.zhimg.com\\/f6745ea878d587a51c37a87e2e6e308a.jpg\"],\"type\":0,\"id\":8913426,\"ga_prefix\":\"102407\",\"title\":\"�������ҵ�Ů�����ж��ӣ���һ����Ҫ�����\"},{\"images\":[\"http:\\/\\/pic1.zhimg.com\\/94811b34d96e1aeb69117d7465ebc8fc.jpg\"],\"type\":0,\"id\":8913343,\"ga_prefix\":\"102407\",\"title\":\"�����������˯��ʱ�䣿\"},{\"images\":[\"http:\\/\\/pic1.zhimg.com\\/189828a22b2f0945f63532edb5d2c8f4.jpg\"],\"type\":0,\"id\":8913257,\"ga_prefix\":\"102407\",\"title\":\"�����ձ� 24 Сʱ���� TOP 5 �� �������չ�������\"},{\"images\":[\"http:\\/\\/pic2.zhimg.com\\/fb416d09f0406e2ecb2ba520fd6d68d9.jpg\"],\"type\":0,\"id\":8911164,\"ga_prefix\":\"102406\",\"title\":\"Ϲ�� �� �����ȷ���²�\"}],\"top_stories\":[{\"image\":\"http:\\/\\/pic3.zhimg.com\\/958b8c4950205c920ef673a885d1b1fa.jpg\",\"type\":0,\"id\":8913325,\"ga_prefix\":\"102409\",\"title\":\"�������Ҫ������������飬С�ı���������ϡ���\"},{\"image\":\"http:\\/\\/pic1.zhimg.com\\/0ad85b64b3cee1fd1e703bc900837180.jpg\",\"type\":0,\"id\":8913343,\"ga_prefix\":\"102407\",\"title\":\"�����������˯��ʱ�䣿\"},{\"image\":\"http:\\/\\/pic1.zhimg.com\\/7e50d96633c38aa343c7cc8d2c44b01c.jpg\",\"type\":0,\"id\":8913257,\"ga_prefix\":\"102407\",\"title\":\"�����ձ� 24 Сʱ���� TOP 5 �� �������չ�������\"},{\"image\":\"http:\\/\\/pic1.zhimg.com\\/e499296bce37b87ef8fcdee134329360.jpg\",\"type\":0,\"id\":8912393,\"ga_prefix\":\"102317\",\"title\":\"֪�������� �� ���Ƕ��Դ���ʲô�óԵĲ�Ʒ��\"},{\"image\":\"http:\\/\\/pic1.zhimg.com\\/337e63021382842cd6c890f589a8d438.jpg\",\"type\":0,\"id\":8906679,\"ga_prefix\":\"102313\",\"title\":\"����һ�ֽп�ǻ����ľ�֢��ҽ�����˼�������\"}]}";
        Parse.parseJSONObject(json);
    }

}
