import com.protopractice.grpc.User;
import com.protopractice.grpc.userGrpc.userImplBase;
import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase {

    @Override
    public void login(User.loginApi request, StreamObserver<User.ResponseApi> responseObserver) {
        String username=request.getUsername();
        String password=request.getPassword();

        User.ResponseApi.Builder response = User.ResponseApi.newBuilder();

        if(username.equals(password)){
            response.setCode(1).setResponseMessage("SUCCESS");
        }
        else{
            response.setCode(100).setResponseMessage("Failure");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }

    @Override
    public void logout(User.empty request, StreamObserver<User.ResponseApi> responseObserver) {
        super.logout(request, responseObserver);
    }
}
