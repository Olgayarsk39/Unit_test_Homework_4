package seminars.fourth.message;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {
    @Test
    public void testNotify(){

        MessageService mockMessageSehvice = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(mockMessageSehvice);
        notificationService.sendNotification("Привет", "Анна");
        verify(mockMessageSehvice, times(1)).sendMessage("Привет", "Анна");

    }

}