package Guzelliksalonu;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BarberTest {

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
          dc.setCapability("appPackage", "com.barberappointment");
          dc.setCapability("appActivity", "com.barberappointment.MainActivity");
          dc.setCapability("noReset", "true");

          ad = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
          wait = new WebDriverWait(ad, 10);
      }
      catch (MalformedURLException mx){

      }
    }

    @Test
    public void Test1() throws InterruptedException {
        genderbutton();
    }
    public void genderbutton() throws InterruptedException {

        ad.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        MobileElement kadinSelect = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"gender-switch-selector\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView")));
        kadinSelect.click();
        ad.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        MobileElement erkekSelect = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.ViewGroup[@content-desc=\"gender-switch-selector\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")));
        erkekSelect.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @Test
    public void Test2() throws InterruptedException {
        searchbutton1();
    }
    public void searchbutton1() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        MobileElement searchebas = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")));
        searchebas.click();
        ad.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        searchebas.sendKeys("eb");
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }
    @Test
    public void Test3() throws InterruptedException {
        Barberenter();
    }
    public void Barberenter() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        MobileElement choice = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")));
        choice.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        MobileElement choicee = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")));
        choicee.click();
    }
    @Test
    public void Test4() throws InterruptedException {
        RandevuAl();
    }
    public void RandevuAl() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        MobileElement randevuSec = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.TextView")));
        randevuSec.click();
        ad.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MobileElement randevuOnayla = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
        randevuOnayla.click();
    }
    @Test
    public void Test5() throws InterruptedException {
        RandevuKontrol();
    }
    public void RandevuKontrol() throws InterruptedException {
       /* ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement kullanicikontrolu = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")));
        kullanicikontrolu.click();
        ad.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        MobileElement customer = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[1]/android.widget.TextView")));
        customer.click();*/
        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement searchbutton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")));
        searchbutton.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        searchbutton.sendKeys("eb");
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        MobileElement choice = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")));
        choice.click();
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        MobileElement choicee = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")));
        choicee.click();

    }
    @Test
    public void Test6() throws InterruptedException {
        Geridon();
    }
    public void Geridon() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement geridonButton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
        geridonButton.click();
        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement searchbas2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")));
        searchbas2.click();
        searchbas2.sendKeys("");
        ad.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //klavyeyi kaldirmak icin
        MobileElement herhangi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")));
        herhangi.click();

    }
    @Test
    public void Test7() throws InterruptedException {
        Randevuiptal();
    }
    public void Randevuiptal() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement kullanicikontrolu = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")));
        kullanicikontrolu.click();
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement iptalButton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView")));
        iptalButton.click();
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement iptalOnayla = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
        iptalOnayla.click();
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement customer = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[1]/android.widget.TextView")));
        customer.click();
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void Test8() throws InterruptedException {
        Barberbutton();
    }
    public void Barberbutton() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement kuaforbilgileri = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[2]/android.widget.TextView")));
        kuaforbilgileri.click();
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void Test9() throws InterruptedException {
        Adminbutton();
    }
    public void Adminbutton() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement Adminsyf = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]/android.widget.TextView")));
        Adminsyf.click();
        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void Test9_1() throws InterruptedException {
        kuaforismi();
    }
    public void kuaforismi() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //en az 5 harften oluşmalı
        MobileElement isimgir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[1]")));
        isimgir.click();

        isimgir.sendKeys("Test");
    }
    @Test
    public void Test9_2() throws InterruptedException {
        mailadresi();
    }
    public void mailadresi() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //en fazla 30 karekter
        MobileElement mailgir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[2]")));
        mailgir.click();

        mailgir.sendKeys("test@gmail.com");
    }
    @Test
    public void Test9_3() throws InterruptedException {
        kuaforgsm();
    }
    public void kuaforgsm() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //10 karakterli olmalı + sadece sayı olacak
        MobileElement numaragir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[3]")));
        numaragir.click();

        numaragir.sendKeys("0536669666");
    }
    @Test
    public void Test9_4() throws InterruptedException {
        kuaforAdresi();
    }
    public void kuaforAdresi() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement adresgir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[4]")));
        adresgir.click();

        adresgir.sendKeys(" istanbul");
    }
    @Test
    public void Test9_5() throws InterruptedException {
        cinsiyet();
    }
    public void cinsiyet() throws InterruptedException {
        //klavyeyi kaldırmak için koydum
        ad.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        MobileElement kuaforbilgileri = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[2]/android.widget.TextView")));
        kuaforbilgileri.click();

        ad.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        MobileElement Adminsyf = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]/android.widget.TextView")));
        Adminsyf.click();

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement cinsiyetbelirle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Switch")));
        cinsiyetbelirle.click();
    }
    @Test
    public void Test9_6() throws InterruptedException {
        eklemebutton();
    }
    public void eklemebutton() throws InterruptedException {
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement Ekle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button/android.widget.TextView")));
        Ekle.click();
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        MobileElement EklemeOnayla = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")));
        EklemeOnayla.click();
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}