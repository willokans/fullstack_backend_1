package com.willokans.fullstackbackend.exception;

public class UserDeletionException extends RuntimeException{
    public UserDeletionException(Long id){
        super("Deletion completed for user with id = "+ id);
    }
}
