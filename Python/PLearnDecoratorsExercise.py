ILL_Users = {
    'name': 'Kalyan',
    'valid': 'True',
    'password': 'Bangaram@118'
}

# initializing vars
user_dict = {}

try:
    name = str(input("Enter your User Name:"))
    password = str(input("Enter your Password:"))
    user_dict = {
        'name': name,
        'password': password
    }
except TypeError as err:
    print("please enter only alphabets")


def AuthenticateUser(func):
    def wrap(*args, **kwargs):
        print('--- Initiated Authenticator ---')
        if user_dict['name'] == ILL_Users['name'] and user_dict['password'] == ILL_Users['password']:
            print('--- Authentication Successful ---')
            result = func(*args, **kwargs)
            print('--- Authentication Completed ---')
            return result
        else:
            print('Invalid User >> Access denied')
            print('--- Authentication Failed ---')

    return wrap


def SendMessage(user):
    print(f'Welcome to ILL {user},\nHave a great learning ahead,\nThank you')


@AuthenticateUser
def ValidateUser(user):
    if ILL_Users.get('valid') == 'True':
        ILL_Users["valid"] = 'True'
        print('--- User Validated ---')
        SendMessage(user['name'])
    else:
        ILL_Users["valid"] = 'False'


ValidateUser(user_dict)
