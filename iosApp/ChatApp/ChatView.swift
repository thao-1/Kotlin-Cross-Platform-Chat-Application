import SwiftUI

struct ChatView: View {
    @State private var message = ""

    var body: some View {
        VStack {
            TextField("Type a message", text: $message)
                .padding()
            Button("Send") {
                // call KMP logic
            }
        }
        .padding()
    }
}
