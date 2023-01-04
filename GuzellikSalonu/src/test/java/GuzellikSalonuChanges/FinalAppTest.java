package GuzellikSalonuChanges;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class FinalAppTest {

    public AndroidDriver<MobileElement> ad;
    public WebDriverWait wait;


    @BeforeTest
    public void BeforeTest() {

        try {
            DesiredCapabilities dc = new DesiredCapabilities();

            dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 4 API 28");
            dc.setCapability("platformName", "Android");
            dc.setCapability("udid", "emulator-5554");
            dc.setCapability("platformVersion", "9.0");
            dc.setCapability("appPackage", "com.silersinv");
            dc.setCapability("appActivity", "com.silersinv.MainActivity");
            dc.setCapability("noReset", "true");

            ad = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
            wait = new WebDriverWait(ad, 10);
        }
        catch (MalformedURLException mx){
        }
    }

    @Test
    public void Test1() throws InterruptedException {
        kullanicisayfa();
    }

    public void kullanicisayfa() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement erkekSelect = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"gender-switch-selector\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")));
        erkekSelect.click();

        ad.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        MobileElement kullanicikontrolu = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")));
        kullanicikontrolu.click();

        ad.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        MobileElement profilDuzenle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")));
        profilDuzenle.click();

        ad.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        MobileElement isimDegistir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")));
        isimDegistir.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        isimDegistir.sendKeys("berk yılmaz");

        ad.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        MobileElement mailDegistir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")));
        mailDegistir.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        mailDegistir.sendKeys("berk11@gmail.com");

        ad.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        MobileElement telDegistir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")));
        telDegistir.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        telDegistir.sendKeys("5368965968");

        ad.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        MobileElement sifreDegistir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[4]")));
        sifreDegistir.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        sifreDegistir.sendKeys("123456789");
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        MobileElement bos = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[5]")));
        bos.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        ad.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        MobileElement sifreTekrarla = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[5]")));
        sifreTekrarla.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        sifreTekrarla.sendKeys("123456789");

        MobileElement bos2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[4]")));
        bos2.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement guncelleButton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button/android.widget.TextView")));
        guncelleButton.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement onaylama = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
        onaylama.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement success = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")));
        success.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement geriButton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
        geriButton.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement geriButton2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
        geriButton2.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement kullanicikontrolu2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")));
        kullanicikontrolu2.click();

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement geriButton3 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
        geriButton3.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


    }

    @Test
    public void Test2() throws InterruptedException {
        barbersayfa();
    }
    public void barbersayfa() throws InterruptedException {

        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement barberButton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[2]")));
        barberButton.click();

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement profiliDuzenle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[6]/android.widget.TextView")));
        profiliDuzenle.click();

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement isimDuzenle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]")));
        isimDuzenle.click();
        isimDuzenle.sendKeys("salon4");

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement mailDuzenle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]")));
        mailDuzenle.click();
        mailDuzenle.sendKeys("salon4@gmail.com");

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement telefonDuzenle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[3]")));
        telefonDuzenle.click();
        telefonDuzenle.sendKeys("5698666688");

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement adresDuzenle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[4]")));
        adresDuzenle.click();
        adresDuzenle.sendKeys("istanbul ndjschdhxjcjksxn");

        MobileElement bos3 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[5]")));
        bos3.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        MobileElement guncelle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button/android.widget.TextView")));
        guncelle.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        MobileElement onayButton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
        onayButton.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        MobileElement successButton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")));
        successButton.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        MobileElement geri1Button = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
        geri1Button.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        MobileElement customerButton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[1]/android.widget.TextView")));
        customerButton.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        MobileElement kuaforkontrol = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView")));
        kuaforkontrol.click();
        kuaforkontrol.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }

    }
