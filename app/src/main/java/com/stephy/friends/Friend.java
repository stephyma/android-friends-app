package com.stephy.friends;

/**
 * Created by Stephy on 5/22/2016.
 */
public class Friend {

        private int _id;
        private String name;
        private String email;
        private String phone;

        public Friend(int _id, String name, String email, String phone) {
                this._id = _id;
                this.name = name;
                this.email = email;
                this.phone = phone;
        }

        public int getId() {
                return _id;
        }

        public void setId(int _id) {
                this._id = _id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }
}