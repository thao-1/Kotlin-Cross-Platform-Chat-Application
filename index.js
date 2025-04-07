const functions = require("firebase-functions");
const admin = require("firebase-admin");
admin.initializeApp();

exports.sendMessageNotification = functions.firestore
    .document("chats/{chatId}/messages/{messageId}")
    .onCreate((snap, context) => {
        const newValue = snap.data();
        const payload = {
            notification: {
                title: "New message",
                body: newValue.content
            }
        };

        return admin.messaging().sendToTopic("chat_updates", payload);
    });