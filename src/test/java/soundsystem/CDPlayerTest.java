package soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)   //在测试开始的时候自动创建Spring的应用上下文。
@ContextConfiguration(classes = CDPlayerConfig.class)   //需要在CDPlayerConfig中加载配置
public class CDPlayerTest {

    @Rule
    public final SystemOutRule systemOutRule =  new SystemOutRule().enableLog();

    @Autowired
   private CompactDisc cd;

    @Autowired
    private MediaPlayer player;



    @Test
    public void add(){
        //断言相加的结果
        Assert.assertEquals(2,1+1);
    }

    @Test
    public void cdShouldNotBeNull() {

        Assert.assertNotNull(cd);

    }

    @Test
    public void play() {
        player.play();
        //断言控制台的输出
        Assert.assertEquals(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles",
                systemOutRule.getLog());

    }


}
